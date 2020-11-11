import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Lancamento } from '../model/lancamento.model';

@Injectable({
  providedIn: 'root'
})
export class LancamentoService {
  [x: string]: any;

  apiUrl = "http://localhost:8080/lancamentos/";

  httpOptions = {
    header: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }
  

  constructor(
    private httpClient: HttpClient
  ) { }

  public getLancamentos(): Observable<Lancamento>{
    return this.httpClient.get<Lancamento>(this.apiUrl)

  }
}
