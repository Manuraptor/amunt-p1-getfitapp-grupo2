<script>
    export let lopdAccepted = false;
    export let paymentType = "tarjeta";
    export let imagen;
    export let name;
    export let birthDate;
    export let idCard;
    export let telNumber;
    export let email;
    export let address;
    export let startDate;
    export let renovationDate;
    export let billingDate;
    export let endDate;
    export let subscriptionType="ANUAL";

    let isChecked = false;

    function toggleCheckbox() {
        isChecked = !isChecked;
    }

    function handlePaymentType(event) {
        paymentType = event.target.value;
    }

    let selected = 'MENSUAL';
    let options = [
        'MENSUAL',
        'TRIMESTRAL',
        'ANUAL'
    ]


</script>

<main>
    <div class="card">
        <div class="image">
            <img src={imagen}/>
            <p class="nombre"><strong>{name}</strong></p>
        </div>

        <div class="personal">
            <div>
                <h2>Información personal</h2>
            </div>
            <div class="texto">
                <p>Fecha de nacimiento: {birthDate}</p>
                <p>DNI: {idCard}</p>
                <p>Teléfono: {telNumber}</p>
                <p>Email: {email}</p>
                <p>Dirección: {address}</p>
                <p>Aceptación LOPD: <input type="checkbox" checked={lopdAccepted} on:change={toggleCheckbox}/></p>
            </div>
        </div>

        <div class="billing">
            <div><h2>Información de facturación</h2>
            </div>
            <div class="texto">
                <p>Fecha de inicio: {startDate}</p>
                <p>Fecha de renovación: {renovationDate}</p>
                <p>Fecha de facturación: {billingDate}</p>
                <p>Fecha de baja: {endDate}</p>
                <p>Forma de pago: <input type="radio" bind:group={paymentType} value="tarjeta"/>
                Pago con tarjeta <input type="radio" bind:group={paymentType} value="efectivo" />
                Pago en efectivo </p>
                <p>Tipo de suscripción: {subscriptionType} <select bind:value={subscriptionType}>
                {#each options as value}
                    <option {value}>{value}</option>
                {/each}>
               
            </div>
        </div>
    </div>
</main>

<style>


    .card {
        display: flex;
        flex-direction: row;
        justify-content: space-between;
        font-size: small;
        background-color: rgb(229, 233, 239);
        border: none;


    }

    img {

        margin-top: 47px;
        height: 165px;
        width: 165px;
    }


    .texto {
        background-color: white;
        border-radius: 6%;
        padding: 5%;
    }

    .personal {
        display: flex;
        flex-direction: column;
        width: 40%;
    }

    h2 {
        margin-top: 20px;
        width: 55%;
        font-size: medium;
        color: aliceblue;
        padding: 0.55em;
        background-color: #0bcbf6;
        border-radius: 10px;

    }

    .image {
        display: flex;
        flex-direction: column;
        width: 20%;
        object-fit: cover;
        margin-right: -50px;
        align-items: center;
    }

    .billing {
        display: flex;
        flex-direction: column;
        width: 40%;

    }

    .nombre {
        margin-top: 13px;
        width: 57%;
        color: aliceblue;
        padding: 0.23em;
        background-color: #0bcbf6;
        font-size: smaller;
        text-align: center;
        border-radius: 10px;


    }

    p {
        line-height: 0.5em;
    }

</style>
