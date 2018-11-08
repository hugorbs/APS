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
    { name: 'nome', value: null },
    { name: 'ementa', value: null },
  ];

  url = 'http://localhost:3002/materia';

  constructor(private http: HttpClient) { }

  ngOnInit(): void {

  }

  public createAluno() {
    const materia = {};
    this.fields.forEach(field => materia[field.name] = field.value);
    materia['codigo'] = parseInt(materia['codigo'], 10);

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
