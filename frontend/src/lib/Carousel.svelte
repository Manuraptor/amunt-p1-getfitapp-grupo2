<script>
  import { onMount, onDestroy } from 'svelte';
  import { afterUpdate } from 'svelte';
 

  const images = [
    'src/assets/imagenes/carusel/image1.png',
    'src/assets/imagenes/carusel/image2.png',
    'src/assets/imagenes/carusel/image3.png',
    'src/assets/imagenes/carusel/image4.png'
  ];

  let currentIndex = 0;
  let interval;

 
  function nextImage() {
    currentIndex = (currentIndex + 1) % images.length;
  }

  onMount(() => {
    interval = setInterval(nextImage, 3000);
  });

  afterUpdate(() => {
    clearInterval(interval);
    interval = setInterval(nextImage, 3000);
  });

  onDestroy(() => {
    clearInterval(interval);
  });
</script>

<style>
  .carousel {
    display: flex;
    justify-content: center;
    align-items: center;
    height: 300px;
  }

  .carousel img {
    max-width: 100%;
    max-height: 100%;
  }
</style>

<div class="carousel">
  <img src={images[currentIndex]} alt="Carousel Image">
</div>