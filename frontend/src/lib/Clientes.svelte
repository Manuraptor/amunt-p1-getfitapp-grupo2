<script>
    import image1 from "../assets/imagenes/clientes/1.jpg";
    import image2 from "../assets/imagenes/clientes/2.jpg";
    import image3 from "../assets/imagenes/clientes/3.jpg";
    import ClientesCard from "./ClientesCard.svelte";


</script>

<main>
    <h1 style="color: white;">Registro de clientes</h1>

    <div class="container">
        <div class="card-1">
<!--            1. quitar cosas que se repiten de los props
                2. usar las props para pasar el valor de paymentType que tiene que
                    aparecer seleccionado
                    lo mismo con tipo de suscripción
                3. Borrar este comentario -->
            <ClientesCard
                    lopdAccepted=true
                    imagen={image1}
                    name="Nelly Dominguez"
                    birthDate="18/09/1983"
                    idCard="34567854G"
                    telNumber="Teléfono: 698675345"
                    email="Email: nelly.dom@gmail.com"
                    address="Dirección: Av/Diagonal 124, Barcelona"
                    startDate="Fecha de inicio: 12/05/2021"
                    renovationDate="Fecha de renovación: 23/12/2022"
                    billingDate="Fecha de facturación: 05/07/2023"
                    endDate="Fecha de baja: 23/12/2023"
                    paymentType="Forma de pago:"
                    subscriptionType="Tipo de suscripción: "
            />

            <div class="card-2">
                <ClientesCard
                        imagen={image2}
                        name="Manuel Rodrígues"
                        birthDate="01/12/1995"
                        idCard="323443256F"
                        telNumber="Teléfono: 6781254365"
                        email="Email: manu.rod@gmail.com"
                        address="Dirección: C/Valencia 45, Barcelona"
                        startDate="Fecha de inicio: 16/05/2023"
                        renovationDate="Fecha de renovación: 16/08/2023"
                        billingDate="Fecha de facturación: 05/07/2023"
                        endDate="Fecha de baja: -/-/-"
                        paymentType="Forma de pago:"
                        subscriptionType="Tipo de suscripción: "
                />

                <div class="card-3">
                    <ClientesCard
                            lopdAccepted=true
                            imagen={image3}
                            name="Federico Martínez"
                            birthDate="24/11/1993"
                            idCard="45665478K"
                            telNumber="Teléfono: 695456098"
                            email="Email: fed.martm@gmail.com"
                            address=" Dirección: C/Mallorca 226, Barcelona"
                            startDate="Fecha de inicio: 08/10/2022"
                            renovationDate="Fecha de renovación: 08/10/2023"
                            billingDate="Fecha de facturación: 05/07/2023"
                            endDate="Fecha de baja: -/-/-"
                            paymentType="Forma de pago:"
                            subscriptionType="Tipo de suscripción: "
                    />
                </div>
            </div>
        </div>
    </div>
</main>

<style>
    main {
        padding-top: 20px;
        background-color: rgb(229, 233, 239);

    }

    h1 {
        text-align: center;
        background-color: #0bcbf6;
        padding: 10px;
        width: 40%;
        font-size: large;
        margin-left: 30%;
        border-radius: 10px;
    }


</style>
