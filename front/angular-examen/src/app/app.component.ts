import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { Usuario } from './models/usuario';
import { Tarea } from './models/tarea';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  selectedUsuario:Usuario = new Usuario();

  usuarioArray: Usuario[]=[
    {id:1, usuario:"OMLA", nombre:"Omar Lara"}
  ];
  
  

}
