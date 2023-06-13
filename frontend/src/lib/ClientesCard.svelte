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
</script>

<main>
  <div class="card">
    <div class="image">
      <img src={imagen} />
      <p>{name}</p>
    </div>
   
    <div class="personal">
      <div>
        <h2>{title}</h2>
       </div>
      <div class="texto">
      <p>{birthDate}</p>
      <p>{idCard}</p>
      <p>{telNumber}</p>
      <p>{email}</p>
      <p>{address}</p>
    </div>
    </div>

    <div class="billing">
      <div><h2>{text}</h2>
      </div>
      <div class="texto">
      <p>{startDate}</p>
      <p>{renovationDate}</p>
      <p>{billingDate}</p>
      <p>{endDate}</p>
      <p>{paymentType}</p>
      <p>{subscriptionType}</p>
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
    height: 160px;
    width: 160px;

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
 }

 .billing{
  width: 40%;
 
 }
</style>
