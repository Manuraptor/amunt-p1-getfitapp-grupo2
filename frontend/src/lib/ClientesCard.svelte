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
      <p><strong>{birthDate}</strong></p>
      <p><strong>{idCard}</strong></p>
      <p><strong>{telNumber}</strong></p>
      <p><strong>{email}</strong></p>
      <p><strong>{address}</strong></p>
      <p><strong>{protectData}</strong> <input type="checkbox" bind:checked={isChecked} on:change={toggleCheckbox} /></p>
    </div>
    </div>

    <div class="billing">
      <div><h2>{text}</h2>
      </div>
      <div class="texto">
      <p><strong>{startDate}</strong></p>
      <p><strong>{renovationDate}</strong></p>
      <p><strong>{billingDate}</strong></p>
      <p><strong>{endDate}</strong></p>
      <p><strong>{paymentType}</strong></p>
      <p><strong>{subscriptionType}</strong></p>
    </div>
    
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
    background-color: rgb(245, 246, 248);
    margin-right: 20px;
    border: none;
    gap: 10px;
  }

  img {
   
    margin-top: 50px;
    height: 150px;
    width: 150px;
   

  }
 
  
    
  
  .texto{
    background-color: white;
   
    border-radius: 8%;
    
  }
.personal{
  width: 35%;
 
}
 h2{
  margin-top: 20px;
  width: 55%;
  font-size: medium;
  
  color: aliceblue;
  padding: 0.8em;
  background-color:  #0bcbf6;
 
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
  font-size: medium;
  
  color: aliceblue;
  padding: 0.4em;
  background-color:  #0bcbf6;

}

</style>
