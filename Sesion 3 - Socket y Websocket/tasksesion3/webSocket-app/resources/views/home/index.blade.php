@extends('layout.general')

@section('contenido')
    <div class="container bg-warning my-auto" style="height: auto; border-radius: 1rem; padding: 1rem">

        <div class="d-flex" style="padding-bottom: 10px; justify-content: space-between">
            <span class=""><strong>Chat en tiempo real</strong></span>
            <span class=""><strong>Laravel + Livewire + Pusher</strong></span>
        </div>

        <div class="bg-dark" style="padding: 1.5rem; border-radius: 1rem">
            <div class="w-auto h-full" style="">
                <div class="col" style="height: auto;">
                    @livewire('chat-list')
                </div>
                <div class="col">
                    @livewire('chat-form')
                </div>
            </div>
        </div>

    </div>
@endsection("contenido")
