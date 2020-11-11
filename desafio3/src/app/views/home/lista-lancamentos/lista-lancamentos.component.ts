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
  lancamentosMes: Lancamento[] = [];
  lancamentosCategoria: Lancamento[] = [];
  
  

  constructor(
    public lancamentoService: LancamentoService
  ) { }

  ngOnInit(): void {
    this.getLancamento();
    this.getLancamentoByMes(7);
    this.getLancamentoByCategoria(1);
  
  }

  getLancamento(){
    
    
   this.lancamentoService.getLancamentos().subscribe((lancamentos: Lancamento[]) =>{
      this.lancamentos = lancamentos;
      console.log(lancamentos);

    });
  }

  getLancamentoByMes(mes: number){
    this.lancamentoService.getLancamentosByMes(mes).subscribe((lancamentosMes: Lancamento[]) =>{
      this.lancamentosMes = lancamentosMes;
      console.log(lancamentosMes);
    });
  }

  getLancamentoByCategoria(categoria: number){
    this.lancamentoService.getLancamentosByCategoria(categoria).subscribe((
      lancamentosCategoria: Lancamento[]) =>{ 
        this.lancamentosCategoria = lancamentosCategoria;
      console.log(lancamentosCategoria);
      }); 
  }

 
}

