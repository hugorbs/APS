import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-create-person',
  templateUrl: './create-person.component.html',
  styleUrls: ['./create-person.component.scss']
})
export class CreatePersonComponent implements OnInit {

  public fields = [
    { name: 'codigo', value: null },
    { name: 'alunos_attributes', value: null },
    { name: 'professores_attributes', value: null },
  ];

  url = 'http://localhost:3000/alunos';
  public content = 'wait for it...';

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    this.http.get(this.url).subscribe(
      value => {
        this.content = JSON.stringify(value);
      }
    )
  }

  public createTurma() {
    const materia = {};
    this.fields.forEach(field => materia[field.name] = JSON.parse(field.value));
    // materia['codigo'] = parseInt(materia['codigo'], 10);

    const body = {
      materia: materia,
    }
    this.http.post(this.url, body).subscribe(
      value => {
        alert('Materia criada!');
        console.log(value);
      }
    );
  }
}
