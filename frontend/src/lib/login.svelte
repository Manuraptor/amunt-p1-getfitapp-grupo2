
    <script>
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
        <input type="text" bind:value={nombre} /><br><br>
        <label>Contraseña</label>
        <input type="text" bind:value={contrasenya} /><br>
        <button>Enviar</button>

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
    border:solid black 1px;


}
.caja{
    margin-top: 15px;
    width:600px;
    height:400px;
    border:solid red 1px;
    display: grid;
    grid-template-columns: 1fr ;

}
h1{
    margin-bottom: 70px;
    margin-left: 250px;
}
form{
    margin-bottom: 180px;
    border: solid green 1px;
}

        button {
            width: 300px;
            display: flex;
            align-items: center;
        }
input{
    width: 380px;
}

    </style>


