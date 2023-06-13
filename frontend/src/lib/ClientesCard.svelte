<script>
  export let title;
  export let text;
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
  export let paymentType;
  export let subscriptionType;
  export let protectData

  let isChecked = false;

function toggleCheckbox() {
  isChecked = !isChecked;
}

function handlePaymentType(event) {
    paymentType = event.target.value;
  }
</script>

<main>
  <div class="card">
    <div class="image">
      <img src={imagen} />
      <p class="nombre"><strong>{name}</strong></p>
    </div>
   
    <div class="personal">
      <div>
        <h2>{title}</h2>
       </div>
      <div class="texto">
      <p><strong>{birthDate}<br>
      {idCard}<br>
      {telNumber}<br>
      {email}<br>
      {address}<br><br>
      {protectData}  <input type="checkbox" bind:checked={isChecked} on:change={toggleCheckbox} /></strong></p>
    </div>
    </div>

    <div class="billing">
      <div><h2>{text}</h2>
      </div>
      <div class="texto">
      <p><strong>{startDate}<br>
      {renovationDate}<br>
      {billingDate}<br>
      {endDate}<br>
      {paymentType}<br><input type="radio" bind:group={paymentType} value="tarjeta" />
      Pago con tarjeta <input type="radio" bind:group={paymentType} value="efectivo" /> 
      Pago en efectivo <br>  
      {subscriptionType}</strong></p>
    </div>

    {#if paymentType === 'tarjeta'}
 
  
{:else if paymentType === 'efectivo'}
 
  
{/if}
    </div>
  </div>
</main>

<style>

 
  .card {
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    margin-top: 50px;
    font-size: small;
    background-color: rgb(229, 233, 239);
    border: none;
   
  }

  img {
   
    margin-top: 50px;
    height: 150px;
    width: 150px;
   

  }
 
  
  
  
  .texto{
    background-color: white;
    border-radius: 8%;
    width: 90%;
    padding-top: 2%;
    padding-bottom: 2%;
    padding-left: 1.5%;
    
  }
.personal{
  width: 40%;
 
}
 h2{
  margin-top: 20px;
  width: 55%;
  font-size: medium;
  color: aliceblue;
  padding: 0.8em;
  background-color:  #0bcbf6;
  border-radius: 10px;
 
 }

 .image{
  width: 20%;
  object-fit: cover;
 }

 .billing{
  width: 40%;
 
 }
.nombre{
  margin-top: 20px;
  width: 55%;
  color: aliceblue;
  padding: 0.4em;
  background-color:  #0bcbf6;
  font-size: smaller;
  text-align: center;
  border-radius: 10px;
 
}

p{
  margin-top: 15px;
}

</style>
