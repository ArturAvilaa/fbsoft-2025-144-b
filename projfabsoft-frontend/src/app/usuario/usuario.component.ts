
import { Usuario } from '../model/usuario';
import { UsuarioService } from '../service/usuario.service';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { ɵNgNoValidate } from '@angular/forms';
import { Router } from '@angular/router';
import { Component, ElementRef, ViewChild } from '@angular/core';
import * as bootstrap from 'bootstrap';

@Component({
  selector: 'app-usuario',
  imports: [HttpClientModule, CommonModule],
  templateUrl: './usuario.component.html',
  styleUrl: './usuario.component.css',
  providers: [UsuarioService, Router]
})

export class UsuarioComponent {
    listaUsuarios: Usuario[] = [];

    constructor(
      private usuarioService: UsuarioService,
      private router:Router
    ) {}
    
    @ViewChild('myModal') modalElement!: ElementRef;
    private modal!: bootstrap.Modal;
  
    private usuarioSelecionado!: Usuario;
    novo(){
      this.router.navigate(['usuarios/novo']); 
    }

    ngOnInit(){
      console.log("carregando Usuarios...");
      this.usuarioService.getUsuario().subscribe(
        usuario => {
          this.listaUsuarios = usuario;
        }
      )
    }

    alterar(usuario:Usuario){
      this.router.navigate(['usuarios/alterar', usuario.id]);
    }
    abrirConfirmacao(usuario:Usuario) {
      this.usuarioSelecionado = usuario;
      this.modal = new bootstrap.Modal(this.modalElement.nativeElement);
      this.modal.show();
  }
  
  fecharConfirmacao() {
    this.modal.hide();
  }
  confirmarExclusao() {
    this.usuarioService.excluirUsuario(this.usuarioSelecionado.id).subscribe(
        () => {
            this.fecharConfirmacao();
            this.usuarioService.getUsuario().subscribe(
              usuario => {
                this.listaUsuarios = usuario;
              }
            );
        },
        error => {
            console.error('Erro ao excluir usuario:', error);
        }
    );
}
 }
