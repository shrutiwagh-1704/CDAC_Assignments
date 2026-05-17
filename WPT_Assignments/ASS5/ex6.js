
async function fetchdata()
{
    const res = await fetch("https://newsapi.org/v2/everything?q=bollywood%20OR%20%22indian%20entertainment%22&sortBy=publishedAt&apiKey=00b8d9401d0a4d48b4318b2d2e069a5a");

    console.log(res);

    const data = await res.json();
    console.log(data);

    const first = data.articles[0];
    console.log(first);

    const container = document.getElementById("news-container");

    data.articles.forEach(article => {
        const card = createCard(article);
        container.appendChild(card);
    });
    

}

// fetchdata();
const btn = document.getElementById("btn");
btn.addEventListener("click", fetchdata);

function createCard(article) {
    const card = document.createElement("div");

    card.innerHTML = `
        <div class="card">
            <img src="${article.urlToImage}" alt="news image" width="200"/>
            <h3>${article.title || "Unknown Author"}</h3>
            <p>${article.description}</p>
        </div>
    `;

    return card;
}