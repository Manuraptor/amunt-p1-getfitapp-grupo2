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
        width: 599px;
        border: solid black 1px;
    }

    img {
        object-fit: cover;
        width: 100%;
        height: 250px;
    }

    .textotarjeta {
        padding: 20px;

    }

    h1 {
        font-weight: bold;

    }
    p{
        font-size: x-large;
    }
</style>

