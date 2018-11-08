import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-create-person',
  templateUrl: './create-person.component.html',
  styleUrls: ['./create-person.component.scss']
})
export class CreatePersonComponent {

  public fields = [
    { name: 'matricula', value: null },
    { name: 'nome', value: null },
    { name: 'login', value: null },
    { name: 'senha', value: null },
  ];

  url = 'http://localhost:3000/alunos';

  constructor(private http: HttpClient) { }

  public createAluno() {
    const aluno = {};
    this.fields.forEach(field => aluno[field.name] = field.value);
    const body = {
      aluno: aluno,
    }
    this.http.post(this.url, body).subscribe(
      value => {
        alert('Aluno criado!');
        console.log(value);
      }
    );
  }
}
