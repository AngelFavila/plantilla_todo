const express = require('express');
const app = express();

app.get('/api/hello', (req, res) => {
    res.json({message: 'Hola Mundo desde Node.js, los saluda Angel'});
});

app.listen(3000, () => console.log('listening on :3000'));