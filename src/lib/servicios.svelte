<script>
    import ServiceCard from "./serviceCard.svelte"
    import imagen1 from "../assets/imagenes/fotoservicios/1.png"
    import imagen2 from "../assets/imagenes/fotoservicios/2.png"
    import imagen3 from "../assets/imagenes/fotoservicios/3.png"


</script>
<section>
    <div class="descripcion">
        <h1>Servicios</h1>
        <p>En GetFitEasy , además de actividades dirigidas, ofrecemos a nuestros abonados los
            servicios necesarios para<br>
            ejercitar el cuerpo, así como mejorar su estilo de vida y bienestar. Aquí te presentamos los
            servicios que<br>
            encontrarás
            en nuestro gimnasio de Barcelona.
        <div class="tarjetas">
            <ServiceCard titulo="CLASES DE NATACIÓN" , texto="Las clases de natación en Barcelona  que ofrece GetFitEasy están dirigidas a la iniciación y perfeccionamiento
            de la técnica." imagen={imagen3}/>
            <ServiceCard titulo="ENTRENADOR PERSONAL" ,
                         texto="Si deseas sacar el máximo partido a tu entrenamiento físico, te ofrecemos un servicio de entrenador personal en el que se te asesora y orienta"
                         imagen={imagen1}/>
            <ServiceCard titulo="TRATAMIENTOS DE FISIOTERAPIA" ,
                         texto="Trabaja tu salud a través de los mejores tratamientos holísticos de fisioterapia en Barcelona."
                         imagen={imagen2}/>
        </div>

    </div>
</section>

<style>
    .tarjetas {

        display: flex;
        flex-wrap: wrap;
        column-gap: 4%;
    }


    p {

        font-size: x-large;
        text-align: center;

    }

    h2 {
        margin-left: 0;
    }

    section {

        margin: 40px 120px;

    }


</style>


