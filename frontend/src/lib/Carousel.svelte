<script>
  import { onMount, onDestroy } from 'svelte';
  
  import image1 from "../assets/imagenes/carusel/image1.png"
  import image2 from "../assets/imagenes/carusel/image2.png" 
  import image3 from "../assets/imagenes/carusel/image3.png"
  import image4 from "../assets/imagenes/carusel/image4.png"
  import CarouselCard from './CarouselCard.svelte';
  


  
  let images = [
    'image1.jpg',
    'image2.jpg',
    'image3.jpg',
    'image4.jpg'
  ];
 
  

  let currentIndex = 0;
  let intervalId = null;

  function startAutoplay() {
    intervalId = setInterval(() => {
      nextSlide();
    }, 3000);
  }

  function stopAutoplay() {
    clearInterval(intervalId);
  }

  function nextSlide() {
    currentIndex = (currentIndex + 1) % images.length;
  }

  onMount(() => {
    startAutoplay();
  });

  onDestroy(() => {
    stopAutoplay();
  });
</script>


<div class="carousel">
  {#each images as image (image)}
    <CarouselCard image={image} />
  {/each}
</div>






