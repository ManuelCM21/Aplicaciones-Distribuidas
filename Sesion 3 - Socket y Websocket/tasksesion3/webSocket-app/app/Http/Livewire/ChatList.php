<?php

namespace App\Http\Livewire;

use Livewire\Component;

class ChatList extends Component
{
    public $mensajes; //se utiliza para almacenar los mensajes recibidos en el chat
    protected $listeners = ['mensajeRecibido']; //indica qué métodos de la clase escuchan los eventos que se emiten desde el navegador.

    public function mount() //Este método se ejecuta cuando se instancia el componente.
    {
        $this->mensajes = [];
    }

    //es un método de escucha que se ejecuta cuando se emite el
    //evento "mensajeRecibido" desde el navegador
    public function mensajeRecibido($mensaje)
    {
        $this->mensajes[] = $mensaje;
    }

    public function render()
    {
        return view('livewire.chat-list');
    }
}
