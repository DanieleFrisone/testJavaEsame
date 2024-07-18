document.addEventListener("DOMContentLoaded", function() {
    fetch('/api/data')
        .then(response => response.json())
        .then(data => {
            const container = document.getElementById('data-container');
            data.forEach(item => {
                const div = document.createElement('div');
                div.textContent = item;
                container.appendChild(div);
            });
        })
        .catch(error => console.error('Errore nel recupero dei dati:', error));
});
