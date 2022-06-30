<!doctype html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Accueil</title>
</head>
<body>
<header>
</header>
<main>
    <h1>ACCUEIL</h1>


    <form action="EnvoieServlet" method="post">
        <select name="background" id="bg">
            <option value="black">Sombre</option>
            <option value="white" selected>Blanc</option>
            <option value="red">Rouge</option>
            <option value="blue">Ocean</option>
        </select>
        <input type="submit" value="Valider">
    </form>

    <p>Vous etes venu</p> X <p>fois</p>
</main>
<footer>
</footer>
</body>
</html>