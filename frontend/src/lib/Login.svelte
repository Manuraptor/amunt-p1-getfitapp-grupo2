<script>
    import {navigate} from "svelte-routing";

    function onSubmit() {
        login().then(() => {
            navigate("/success", {replace: true});
        });

    }

    let nombre = "";
    let contrasenya = "";
</script>
<div>
    <h1>Login</h1>
    <form>
        <input type="text" bind:value={nombre} required placeholder="Nombre"/>
        <input type="text" bind:value={contrasenya} required placeholder="Contraseña"/>
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

</style>



