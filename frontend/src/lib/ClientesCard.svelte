<script>
  export let title
  export let customer;
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
  export let subscriptionType

    </script>
    
       
    <main>

      <div class="card">

               
        <div class="customer">
          <div class="image">
            img src={customer}
            <h2>{name}</h2>
          </div>

          <div class="personal-info">
            <h1>{title}</h1>
            <p>{birthDate}</p>
            <p>{idCard}</p>
            <p>{telNumber}</p>
            <p>{email}</p>
            <p>{address}</p>
          </div>

          <div class="billing-info">
            <h1>{title}</h1>
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
     
    </style>