<div class="">

    <div class="bg-dark" style="height: 20rem;">
        <div class="card-body" style="max-height: 20rem; overflow-y: auto;">
            @foreach ($mensajes as $mensaje)
                @if ($mensaje['usuario'] == "Manuel Chunca")
                    <div style="display: flex; justify-content: end;">
                        <div class="alert alert-success" style="width: max-content; max-width: 60%;">
                            <strong>{{ $mensaje['usuario'] }}</strong>
                            <br><span class="text-muted" style="margin-right: 1rem">{{ $mensaje['mensaje'] }}</span>
                            <small style="">{{ $mensaje['hora'] }}</small>
                        </div>
                    </div>
                @else
                    <div style="display: flex; justify-content: start;">
                        <div class="alert alert-warning" style="width: max-content; max-width: 60%;">
                            <strong>{{ $mensaje['usuario'] }}</strong>
                            <br><span class="text-muted" style="margin-right: 1rem">{{ $mensaje['mensaje'] }}</span>
                            <small style="">{{ $mensaje['hora'] }}</small>
                        </div>
                    </div>
                @endif
                <script>
                    scrollToBottom();
                </script>
            @endforeach
        </div>
    </div>

    <script>
        // La clave de API es un identificador único que permite a
        //Pusher conectarse con un proyecto específico en la plataforma Pusher.
        var pusher = new Pusher('bca2407e07a06f0b7080', {
            cluster: 'eu'
        });

        //suscribe al canal de chat utilizando el método subscribe() de la instancia de Pusher
        var channel = pusher.subscribe('chat-channel');

        //se ejecutará cada vez que se emita el evento 'chat-event' en el canal de chat.
        //Cuando se recibe el evento, la función utiliza el método window.livewire.emit()
        //para emitir un evento personalizado de Livewire llamado 'mensajeRecibido', junto
        //con los datos recibidos del evento Pusher.
        channel.bind('chat-event', function(data) {
            window.livewire.emit('mensajeRecibido', data);
        });
    </script>

    <script>
        // Obtenemos el contenedor card-body
        var cardBody = document.querySelector('.card-body');

        // Movemos el scroll hacia abajo al cargar la página
        cardBody.scrollTop = cardBody.scrollHeight;

        // Movemos el scroll hacia abajo cada vez que se agrega un nuevo mensaje
        function scrollToBottom() {
            cardBody.scrollTop = cardBody.scrollHeight;
        }
    </script>

</div>
