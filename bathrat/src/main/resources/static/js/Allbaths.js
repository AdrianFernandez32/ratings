const dummy = [
    {
      "id": "1",
      "ubicacion": "Biblioteca primer piso.",
      "sexo": "Hombre"
    },
    {
      "id": "2",    
      "ubicacion": "Biblioteca segundo piso.",
      "sexo": "Hombre"
    },
    {
      "id": "3",
      "ubicacion": "Gimnasio primer piso.",
      "sexo": "Hombre"
    },
    {
      "id": "4",
      "ubicacion": "Gimnasio segundo piso.",
      "sexo": "Hombre"
    },
    {
      "id": "5",
      "ubicacion": "Gimnasio regaderas.",
      "sexo": "Hombre" 
    },
    {
      "id": "6",
      "ubicacion": "Profesional primer piso.",
      "sexo": "Hombre"
    },
    {
      "id": "7",
      "ubicacion": "Profesional segundo piso.",
      "sexo": "Hombre"
    }
  ]



const container = document.getElementById("all-baths")

container.innerHTML = dummy.map(user => 
    `<div class="flex justify-between items-center px-2 py-2 bg-gray-400 rounded-full mb-5">
        <span class="ml-6">Baño 1</span>
        <button class="bg-green-500 px-10 py-2 text-green-800 rounded-full buttons transitions">
            <span>Rate</span>
        </button>
    </div>`
).join('')


    