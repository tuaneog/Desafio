import { Component, OnInit } from '@angular/core';
import { Lancamento } from 'src/app/shared/model/lancamento.model';
import { LancamentoService } from 'src/app/shared/service/lancamento.service';


@Component({
  selector: 'app-lista-lancamentos',
  templateUrl: './lista-lancamentos.component.html',
  styleUrls: ['./lista-lancamentos.component.css']
})
export class ListaLancamentosComponent implements OnInit {

  lancamentos: Lancamento[] = []
  meses = ["Janeiro", "Fevereiro", "Março", "Abril",
"Junho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"]
  
  

  constructor(
    public lancamentoService: LancamentoService
  ) { }

  ngOnInit(): void {
    this.getLancamento();
  }

  getLancamento(){
    
    
   this.lancamentoService.getLancamentos().subscribe((lancamentos: Lancamento[]) =>{
      this.lancamentos = lancamentos;
      console.log(lancamentos);

    });
  }


  private newMethod() {
    console.log("buscando lancamentos");
  }
}

