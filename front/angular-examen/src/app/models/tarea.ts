import { EstadoTarea } from "./estado-tarea";
import { Usuario } from "./usuario";

export class Tarea {
    id:number;
    titulo: string;
    descripcion: string;
    fechaCreacion: Date;
    estado: EstadoTarea;
    usuario: Usuario;
}
