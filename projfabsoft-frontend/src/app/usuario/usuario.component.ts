import { Component } from '@angular/core';
import { Usuario } from '../model/usuario';
import { UsuarioService } from '../service/usuario.service';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { ɵNgNoValidate } from '@angular/forms';
import { Router } from '@angular/router';

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
 }
