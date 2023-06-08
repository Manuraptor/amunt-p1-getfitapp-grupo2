
<script>

    /* import {user} from "../stores/user"*/

        import { navigate } from "svelte-routing";
        function onSubmit() {
        login().then(() => {
            navigate("/success", { replace: true });
        });

    }
        let nombre ="";
        let contrasenya ="";
</script>
<div class="contenedor">
    <div class="caja">
        <h1>LOGIN</h1>
    <form class="content">
        <label>Nombre</label>
        <input type="text" bind:value={nombre} required /><br><br>
        <label>Contraseña</label>
        <input type="text" bind:value={contrasenya} required /><br>
        <button type="submit">Enviar</button>


    </form>
        </div>
</div>
    <style>
.contenedor{
    width: 1500px;
    height: 819px;
    margin-left: 200px;
    display: flex;
    align-items: center;
    justify-content: center;
    /*border:solid black 1px;*/

}
.caja{
    margin-top: 15px;
    width:600px;
    height:599px;
    border:solid  1px;
    display: grid;
    grid-template-columns: 1fr ;

}
h1{
    margin-bottom: 70px;
    margin-left: 250px;
}


        button {
            width: 200px;
            height: 70px;
            border-radius:7px;
            background: #0bcbf6;
            margin-bottom:100px;
            text-align: center;




        }
input{
    width: 380px;
    height: 70px;
}
.content{

    display: flex;
    flex-direction: column;
    align-items: center;

}

    </style>



