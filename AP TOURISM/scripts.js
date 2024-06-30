function changeContent(page) {
    var contentDiv = document.getElementById('content');

    switch (page) {
        case 'home':
            contentDiv.innerHTML = `
                <img src="https://assets.thehansindia.com/h-upload/2022/04/19/1287788-ap-tourism-hub.jpg">
                <h2>Welcome to the Home Page!</h2>
                <p>This is the main page of Andhra Pradesh Tourism.</p>
                <p>Explore the different sections using the navigation menu.</p>
            `;
            break;
        case 'about':
            contentDiv.innerHTML = `
                <h2>Tourist Places in Andhra Pradesh</h2>
                <div id="data-container">
                    <div class="card-container" id="card-container">
                        <!-- Cards will be inserted here -->
                    </div>
                </div>
                <div class="pagination" id="pagination">
                    <a href="#" id="prev" onclick="prevPage()">Previous</a>
                    <a href="#" id="next" onclick="nextPage()">Next</a>
                </div>
            `;
            displayCards(currentPage);
            break;
        case 'contact':
            contentDiv.innerHTML = `
                <h2>Contact Us</h2>
                <p>Feel free to reach out to us!</p>
                <form>
                    <label for="name">Name:</label>
                    <input type="text" id="name" name="name" placeholder="Your Name" required>
                    <label for="email">Email:</label>
                    <input type="email" id="email" name="email" placeholder="Your Email" required>
                    <label for="message">Message:</label>
                    <textarea id="message" name="message" placeholder="Your Message" rows="4" required></textarea>
                    <button type="submit">Send Message</button>
                </form>
            `;
            break;
        default:
            contentDiv.innerHTML = '<h2>Page not found!</h2>';
    }
}

const cards = [
    { title: "Araku Valley", image: "https://www.esamskriti.com/essays/docfile/42_3765.jpg",
         description: "Araku Valley is a hill station in Visakhapatnam district in the Indian state of Andhra Pradesh, lying 111 km west of Visakhapatnam city. This place is often referred to as Ooty of Andhra." },
    { title: "Tirupathi", image: "https://balajidarshanbooking.com/blog/wp-content/uploads/2024/03/1-1.webp", 
        description: "Tirupati is home to the famous Tirumala Venkateswara Temple, one of the most visited pilgrimage sites in the world." },
    { title: "Vijayawada", image: "https://i.pinimg.com/736x/2c/22/ca/2c22ca371295e26cf22963137ce6be5d.jpg", 
        description: "Vijayawada, situated on the banks of the Krishna River, is a major city with significant historical and cultural importance.The Kanaka Durga Temple, Prakasam Barrage, and Undavalli Caves are among its popular attractions." },
    { title: "Visakhapatnam", image: "https://sunrayvillageresort.com/blog/admin/assets/img/post/image_2023-06-21-10-45-13_6492d4b9994cb.png", 
        description: "Visakhapatnam, often called Vizag, is a coastal city known for its beautiful beaches, bustling port, and scenic hills. Key attractions include the INS Kurusura Submarine Museum, Kailasagiri Hill Park, and the picturesque Araku Valley nearby." },
    { title: "Lambasingi", image: "https://static.toiimg.com/thumb/73151165/lambasingi.jpg?width=1200&height=900", 
        description: "Lambasingi is also known as Korra Bayalu, which translates to 'if someone stays out in the open, they will freeze like a stick!' in the local language. Lambasingi is well-known for its tea and coffee plantations, as well as small apple and strawberry fields." },
    { title: "Lepakshi", image: "https://travelsetu.com/apps/uploads/new_destinations_photos/destination/2024/01/01/3a78be2ab7025f09e2f3d4703aa1a30c_1000x1000.jpg", 
        description: "The Lepakshi temple, also known as Veerbhadra temple is located in the tiny hamlet of Anantapur District of Andhra Pradesh. It is famous for its architecture characterised by hanging pillars and cave chambers that can astound you!" },
    { title: "kondareddy buruju", image: "https://qph.cf2.quoracdn.net/main-qimg-6ad21a495408ce448f682b65b3d9684a.webp", 
        description: "Konda Reddy Burz is a unique monument due to its singular feature of an underground tunnel which connects the fort to Gadwal, a place 52 km away. The most remarkable feature of this tunnel is that it passes under the River Tungabhadra, a feat unimaginable during the medieval times." },
    { title: "Talakona Waterfalls", image: "https://imgstaticcontent.lbb.in/lbbnew/wp-content/uploads/sites/2/2017/05/28193544/TalakonaWaterfalls1.jpg",
         description: "Cascading from a height of 270ft, Talakona is the tallest waterfall in Andhra Pradesh. The forests around the falls have been developed as an ecotourism spot. Consequently, it is an accessible part of the largely out-of-bounds Venkateswara National Park." },
    { title: "Horsley hills", image: "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiIuL0mhkibUM45BkO2wYHpoHGB1wvsBP0lEXN85s2xVjttLnXGnJzKWrp-odnllVfQW1bVVA0Sk0x93hyphenhyphenO4a3GT_3O3Ekv8dzsmgACQimG1eZorp85fxOZA58a5TBdh1lIa3X07Ix5r0Xc/",
         description: "An integral part of the Eastern Ghats, Horsley Hills are a beautiful destination for all nature enthusiasts and especially for those seeking peace and quietude in day- to- day life. This beautiful marvel is situated at a height of 4312 meters and is known for its stunning landscape." },
    { title: "Amaravathi", image: "https://bl-i.thgim.com/public/migration_catalog/article18175831.ece/alternates/FREE_1200/BL06_BP_AMARAVATHI1",
         description: "Amaravati was a seat of Buddhism prior to the rise of Satavahanas, and a stupa and monastery were built there during the reign of Emperor Ashoka (269-232 BC) under Mauryan Empire." }
];

let currentPage = 1;
const cardsPerPage = 2;

function displayCards(page) {
    const start = (page - 1) * cardsPerPage;
    const end = start + cardsPerPage;
    const cardsToDisplay = cards.slice(start, end);
    const cardContainer = document.getElementById('card-container');
    cardContainer.innerHTML = '';

    cardsToDisplay.forEach(card => {
        cardContainer.innerHTML += `
            <div class="card">
                <img src="${card.image}" alt="${card.title}">
                <h3>${card.title}</h3>
                <p>${card.description}</p>
            </div>
        `;
    });

    document.getElementById('prev').style.display = page === 1 ? 'none' : 'inline';
    document.getElementById('next').style.display = end >= cards.length ? 'none' : 'inline';
}

function prevPage() {
    if (currentPage > 1) {
        currentPage--;
        displayCards(currentPage);
    }
}

function nextPage() {
    if (currentPage * cardsPerPage < cards.length) {
        currentPage++;
        displayCards(currentPage);
    }
}

function goToPage(page) {
    currentPage = page;
    displayCards(currentPage);
}

document.addEventListener('DOMContentLoaded', () => {
    displayCards(currentPage);
});


