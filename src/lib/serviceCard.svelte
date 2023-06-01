<script>
    export let titulo
    export let texto
    export let imagen

</script>
<div class="contenedor">
    <img src={imagen}>

    <div class="textotarjeta">
        <h1>{titulo}</h1>
        <p> {texto}</p>
    </div>

</div>


<style>

    .contenedor {
        width: 25%;
        border: solid black 1px;
    }

    img {
        object-fit: cover;
        width: 100%;
        height: 250px;
    }

    .textotarjeta {
        width: 80%;
        padding: 10px;

    }

    h1 {
        font-weight: bold;
        margin-left: 20px;

    }


</style>

