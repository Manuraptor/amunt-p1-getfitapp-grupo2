<script>
    import image1 from "../assets/imagenes/clientes/1.jpg";
    import image2 from "../assets/imagenes/clientes/2.jpg";
    import image3 from "../assets/imagenes/clientes/3.jpg";
    import ClientesCard from "./ClientesCard.svelte";


</script>""

<main>
    <h1 style="color: white;">Registro de clientes</h1>

    <div class="container">
        <div class="card-1">

            <ClientesCard

                    imagen={image1}
                    name="Nelly Dominguez"
                    birthDate="18/09/1983"
                    idCard="34567854G"
                    telNumber="698675345"
                    email="nelly.dom@gmail.com"
                    address="Av/Diagonal 124, Barcelona"
                    lopdAccepted=true
                    startDate="12/05/2021"
                    renovationDate="23/12/2022"
                    billingDate="05/07/2023"
                    endDate="23/12/2023"
                    paymentType="efectivo"
                    subscriptionType="ANUAL"
            />

            <div class="card-2">
                <ClientesCard

                        imagen={image2}
                        name="Manuel Rodrígues"
                        birthDate="01/12/1995"
                        idCard="323443256F"
                        telNumber="6781254365"
                        email="manu.rod@gmail.com"
                        address="C/Valencia 45, Barcelona"
                        lopdAccepted=false
                        startDate="16/05/2023"
                        renovationDate="16/08/2023"
                        billingDate="05/07/2023"
                        endDate=" -/-/-"
                        paymentType="tarjeta"
                        subscriptionType="TRIMESTRAL"
          />

          <div class="card-3">
              <ClientesCard


                      imagen={image3}
                      name="Federico Martínez"
                      birthDate="24/11/1993"
                      idCard="45665478K"
                      telNumber="695456098"
                      email="fed.martm@gmail.com"
                      address="C/Mallorca 226, Barcelona"
                      lopdAccepted=true
                      startDate="08/10/2022"
                      renovationDate="08/10/2023"
                      billingDate="05/07/2023"
                      endDate=" -/-/-"
                      paymentType="efectivo"
                      subscriptionType="MENSUAL"
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
