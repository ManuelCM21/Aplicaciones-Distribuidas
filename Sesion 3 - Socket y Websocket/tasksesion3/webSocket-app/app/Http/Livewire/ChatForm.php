<?php

namespace App\Http\Livewire;

use Livewire\Component;

class ChatForm extends Component
{
    public $usuario;
    public $mensaje;
    public $hora;

    private $faker; // Generar datos para pruebas

    // Cuando se Inicia el Componente (antes de Render)
    public function mount()
    {
        $this->faker = \Faker\Factory::create(); // Instanciamos Faker
        $this->usuario = $this->faker->name; // generamos el usuario con Faker
        $this->mensaje = $this->faker->realtext(25); // Generamos el primer texto de prueba
        $this->hora = date('g:i a'); // Generamos la hora
    }

    // se ejecuta automáticamente cada vez que se actualiza un campo en el formulario
    public function updated($field)
    {
        $this->validateOnly($field, [
            'usuario' => 'required',
            'mensaje' => 'required',
        ]);
    }

    public function enviarMensaje()
    {
        // Este evento será recibido por un listener que se encargará
        //de enviar el mensaje a los demás usuarios conectados al chat.
        event(new \App\Events\EnviarMensaje($this->usuario, $this->mensaje, $this->hora));

        // Este evento es para que lo reciba el componente
        // por Javascript y muestre el ALERT BOOSTRAP de "enviado"
        $this->emit('mensajeEnviado');

        // Creamos un nuevo texto aleatorio (para el próximo mensaje)
        $this->faker = \Faker\Factory::create();
        $this->mensaje = $this->faker->realtext(20);
    }

    public function render()
    {
        return view('livewire.chat-form');
    }
}
