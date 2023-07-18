const express = require('express');
const bodyParser = require('body-parser');

const app = express();
const path = require('path');

const router = express.Router();

router.get('/',function(req,res){
    res.sendFile(path.join(_dirname+'index.html'));

})

router.get('/finaly',function(req,res){
    res.sendFile(path.join(_dirname+'finaly.html'));

})

// Processando os dados do formulário
app.use(bodyParser.urlencoded({ extended: false }));
app.use('/',router);

// Página inicial exibindo o formulário
app.get('/', (req, res) => {
    res.sendFile(__dirname + '/formulario.html');
});

// Processando o envio do formulário
app.post('/processar-formulario', (req, res) => {
    const nome = req.body.nome;
    const email = req.body.email;

    // Aqui você pode fazer o processamento dos dados do formulário como desejar
    // Por exemplo, salvar em um banco de dados, enviar por email, etc.

    res.send(`O formulário foi enviado com sucesso!<br>Nome: ${nome}<br>Email: ${email}`);
});

app.listen(process.env.port || 3000);

console.log("Servidor rodando em http://localhost:${3000}!");