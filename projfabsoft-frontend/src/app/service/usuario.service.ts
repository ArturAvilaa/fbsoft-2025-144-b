import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'; // Correção aqui
import { Usuario } from '../model/usuario';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {
  apiURL = "http://localhost:8080/api/v1/usuario";
  
  constructor(private http: HttpClient) { } // Correção aqui

  getUsuario() {
    return this.http.get<Usuario[]>(this.apiURL);
  }
  
  saveUsuario(usuario:Usuario){
    if(usuario.id){
      return this.http.put(this.apiURL + '/' + usuario.id, usuario);
    }
    return this.http.post(this.apiURL,usuario);
  }
  excluirUsuario(id: any){        
    return this.http.delete<Usuario>(this.apiURL + '/' + id);
  }
  getUsuarioById(id: any){
    return this.http.get<Usuario>(this.apiURL + `/` + id)
  }
}

