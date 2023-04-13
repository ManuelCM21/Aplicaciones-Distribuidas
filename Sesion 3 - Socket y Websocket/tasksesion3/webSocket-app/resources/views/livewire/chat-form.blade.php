<div
    style="border-top: 1px; border-color: #D2D2D2; border-style: solid; border-left: 0px; border-right: 0px; border-bottom: 0px">
    <!-- Mensaje de Chat a Enviar -->
    <div class="d-flex gap-2 mt-2 text-white">
        <!-- El Usuario -->
        <div class="" style="width: 30%">
            <label for="usuario" style="margin-bottom: 8px">Usuario</label>
            <input type="text" wire:model="usuario" class="form-control" id="usuario">
            <!-- Validación -->
            @error('usuario')
                <small class="text-danger">{{ $message }}</small>
            @enderror
        </div>

        <div class="" style="width: 70%">
            <label for="mensaje">Mensaje</label>
            <div class="pt-2 d-flex gap-2">
                <input type="text" wire:model="mensaje" wire:keydown.enter="enviarMensaje" class="form-control"
                    id="mensaje">
                <button class="btn btn-primary" wire:click="enviarMensaje">
                    <div style="transform: rotate(45deg); margin-right: 5px">
                        <i class="bi bi-send"></i>
                    </div>
                </button>
            </div>
            <!-- Validación -->
            @error('mensaje')
                <small class="text-danger">{{ $message }}</small>
            @enderror
        </div>
    </div>

    <!-- Mensajes de alerta -->
    <div style="position: absolute; top: 5px; right: 5px;" class="alert alert-success collapse" role="alert"
        id="avisoSuccess">
        Se ha enviado
    </div>

    <script>
        //El código utiliza la función window.livewire.on()
        //para escuchar un evento emitido por Livewire llamado "mensajeEnviado"
        //Cuando se recibe este evento, la función especificada en el segundo parámetro se ejecuta
        window.livewire.on('mensajeEnviado', function() {
            //Mostramos el aviso
            $("#avisoSuccess").fadeIn("slow");

            //ocultamos el aviso a los 3 segundos
            setTimeout(function() {
                $("#avisoSuccess").fadeOut("slow");
            }, 3000)
        })
    </script>

</div>
