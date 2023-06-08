<script>
<<<<<<< HEAD

    /* import {user} from "../stores/user"*/

        import { navigate } from "svelte-routing";
        function onSubmit() {
=======
    import {navigate} from "svelte-routing";

    function onSubmit() {
>>>>>>> fde7aabfd556891fee689892fa619d6e5256d86f
        login().then(() => {
            navigate("/success", {replace: true});
        });

    }

    let email = "";
    let contrasenya = "";
</script>
<div>
    <h1>Login</h1>
    <form>
        <input type="text" bind:value={email} required placeholder="Email"/>
        <input type="text" bind:value={contrasenya} required placeholder="Contraseña"/>
        <button type="submit">Enviar</button>
    </form>
</div>
<<<<<<< HEAD
    <style>
.contenedor{
    width: 1500px;
    height: 819px;
    margin-left: 200px;
    display: flex;
    align-items: center;
    justify-content: center;
    /*border:solid black 1px;*/
=======
<style>

    div {
       max-width: 640px;
        margin: 130px auto;
        border: 1px solid black;
    }

>>>>>>> fde7aabfd556891fee689892fa619d6e5256d86f

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



