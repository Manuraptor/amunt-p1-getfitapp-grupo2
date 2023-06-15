<script>
    import {navigate} from "svelte-routing";


    let email = "";
    let contrasenya = "";
    let error = false;

    function validar() {
        if (email === "paula@gmail.com" && contrasenya === "123456") {
            navigate("./clientes");
        } else {
            error=true;
        }
    }
</script>
<div>
    <h1>Login</h1>
    <form on:submit|preventDefault={validar}>
        <input type="text" bind:value={email} required placeholder="Email"/>
        <input type="text" bind:value={contrasenya} required placeholder="Contraseña"/>
        {#if error}
            <p>datos incorrectos</p>
        {/if}
        <button type="submit">Enviar</button>
    </form>
</div>

<style>

    div {
        max-width: 640px;
        margin: 130px auto;
        border: 1px solid black;
    }


    h1 {
        margin: 70px;
        text-align: center;
    }


    button {
        width: 200px;
        height: 70px;
        border-radius: 7px;
        background-color: #18a0fb;
        color: white;
        margin: 70px;
        text-align: center;
    }

    input {
        width: 500px;
        height: 70px;
        margin: 15px 0;
        border-radius: 3px;
        padding: 15px;
    }

    form {
        display: flex;
        flex-direction: column;
        align-items: center;

    }
    p{
        color: red;
    }

</style>



