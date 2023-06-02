<script>
    import imagen from "../assets/imagenes/image1.png"
</script>

<main>
    <h4>
        Somos <span class="getfit">GetFitEasy</span>, una cadena de asesoramiento de
        salud y bienestar. En nuestro local ofrecemos un espacio de maquinas y
        hacemos clases y seguimientos con los mejores especialistas.
    </h4>
    <img src={imagen} alt="imagen1">
</main>
<style>

    .getfit {
        color: rgb(86, 195, 235);
        font-weight: 600;
    }

    main {
        width: 100%;
        display: flex;
        flex-direction: column;
        align-items: center;
    }

    h4 {
        width: 80%;
    }

    img {
        width: 80%;

    }

</style>