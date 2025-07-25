import { Component } from '@angular/core';
import { Usuario } from '../model/usuario';
import { UsuarioService } from '../service/usuario.service';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router, ActivatedRoute, ParamMap } from '@angular/router';

@Component({
  selector: 'app-form-usuario',
  imports: [HttpClientModule, CommonModule, FormsModule],
  templateUrl: './form-usuario.component.html',
  styleUrl: './form-usuario.component.css',
  providers: [UsuarioService, Router]
})
export class FormUsuarioComponent {
  usuario: Usuario = new Usuario();

  constructor(
    private UsuarioService:UsuarioService,                
    private router:Router,
    private activeRouter: ActivatedRoute

  ){
    const id = this.activeRouter.snapshot.paramMap.get('id');

    if (id) {
      this.UsuarioService.getUsuarioById(id).subscribe(usuario => {
        this.usuario = usuario;
      });
    }

  }

  salvar(){
    this.UsuarioService.saveUsuario(this.usuario)
      .subscribe(resultado => {
          this.router.navigate(['usuarios'])
      }


      )
  }

}
