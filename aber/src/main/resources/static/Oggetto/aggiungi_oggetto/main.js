document.addEventListener("DOMContentLoaded", () => {
    const form = document.getElementById('aggiungiOggettoForm');
    
    form.addEventListener('submit', (event) => {
        event.preventDefault();

        const nuovoOggetto = {
            nome: document.getElementById('nome').value,
            costo: parseFloat(document.getElementById('costo').value),
            imageUrl: document.getElementById('imageUrl').value,
            multiplier: parseFloat(document.getElementById('multiplier').value),
            venditoreID: parseInt(document.getElementById('venditoreID').value),
            quantità: parseInt(document.getElementById('quantità').value)
        };

        fetch('api/oggetti/aggiungi-oggetto', {
            method: 'post',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(nuovoOggetto)
        })
        .then(response => {
            if (!response.ok) {
                throw new Error('Errore nell\'aggiunta dell\'oggetto');
            }
            return response.json();
        })
        .then(successo => {
            console.log('Aggiunta oggetto avvenuta con successo!' + successo);
        })
        .catch(error => {
            console.warn('Errore durante l\'aggiunta dell\'oggetto');
            throw new Error('Errore durante l\'aggiunta dell\'oggetto');
        });
    });
});
