package com.example.DiscografiaBeyonce.models

import com.example.discografiabeyonce.R


data class Discos (
    val id: Int,
    val name: String,
    val year: String,
    val imageRes: Int,
    val description: String,
    val curiosities: String,
    var isFavorite: Boolean = false
)
val discosList = listOf(
    Discos(
        id = 1,
        name = "Dangerously in Love",
        year = "2003",
        imageRes = R.drawable.dangerouslyinlove,
        description = "Dangerously in Love é o álbum de estreia solo de Beyoncé, com uma mistura de R&B, pop e hip hop. Ele foi um grande sucesso, com hits como \"Crazy in Love\" e \"Baby Boy\", e recebeu cinco Grammys. O álbum consolidou Beyoncé como uma das principais artistas da música.",
        curiosities = "Uma curiosidade interessante sobre o álbum \"Dangerously in Love\" é que a canção \"Crazy in Love\" foi uma colaboração com seu então namorado, Jay-Z. A música se tornou um dos maiores sucessos de sua carreira e é frequentemente considerada uma das melhores músicas pop dos anos 2000."
    ),

    Discos(
        id = 2,
        name = "Bday",
        year = "2006",
        imageRes = R.drawable.bday,
        description = "O segundo álbum de Beyoncé, \"B'Day\" (2006), é uma obra mais energética e ousada, com influências de R&B, funk, pop e soul. Lançado no seu aniversário de 25 anos, o álbum inclui sucessos como \"Irreplaceable\", \"Déjà Vu\" e \"Upgrade U\". \"B'Day\" é marcado por um som mais agressivo e empoderado, destacando a autoconfiança e a independência de Beyoncé. ",
        curiosities = "O álbum foi aclamado pela crítica e ganhou diversos prêmios, incluindo dois Grammys."
    ),

    Discos(
        id = 3,
        name = "I am... Sasha Fierce",
        year = "2008",
        imageRes = R.drawable.sashafierce,
        description = "O terceiro álbum de Beyoncé, \"I Am... Sasha Fierce\" (2008), é uma obra dividida em dois lados: um mais suave e emocional, representado por \"I Am...\", e outro mais energético e ousado, sob a persona de \"Sasha Fierce\". O álbum inclui grandes sucessos como \"Single Ladies (Put a Ring on It)\", \"If I Were a Boy\", e \"Halo\".",
        curiosities = "A música \"Single Ladies\" se tornou um ícone cultural. O álbum foi um enorme sucesso comercial e rendeu vários prêmios, incluindo seis Grammys."
    ),

    Discos(
        id = 4,
        name = "4",
        year = "2011",
        imageRes = R.drawable.quatro,
        description = "O quarto álbum de Beyoncé, \"4\" (2011), marca um retorno a um som mais pessoal e autêntico, com influências de R&B, soul, funk e pop. O álbum apresenta faixas como \"Run the World (Girls)\", \"Best Thing I Never Had\", e \"1+1\", mostrando uma abordagem mais madura e emocional em comparação com seus trabalhos anteriores.",
        curiosities = "Beyoncé se afastou das produções comerciais para explorar uma sonoridade mais experimental e o álbum recebeu um Grammy."
    ),

    Discos(
        id = 5,
        name = "Beyoncé",
        year = "2013",
        imageRes = R.drawable.beyonceselftitled,
        description = "O quinto álbum de Beyoncé, \"Beyoncé\" (2013), é um trabalho inovador e visualmente impactante, lançado de forma surpresa sem aviso prévio. O álbum mistura R&B, pop, trap e eletrônica, com temas de feminismo, sexualidade e maternidade. Faixas como \"Drunk in Love\", \"Partition\" e \"Pretty Hurts\" destacam sua abordagem mais ousada e íntima. ",
        curiosities = "\"Beyoncé\" foi aclamado pela crítica, e sua estratégia de lançamento revolucionou a indústria musical, consolidando ainda mais sua posição como uma das maiores artistas da atualidade."
    ),

    Discos(
        id = 6,
        name = "Lemonade",
        year = "2016",
        imageRes = R.drawable.lemonade,
        description = "O sexto álbum de Beyoncé, \"Lemonade\" (2016), é um trabalho visual e conceitual que mistura R&B, rock, hip hop, country e pop. O álbum aborda temas como traição, empoderamento feminino, racismo e reconciliação, com uma narrativa poderosa sobre a dor e a cura em um relacionamento.",
        curiosities = "Lemonade\" foi amplamente aclamado pela crítica, sendo considerado um dos melhores álbuns da década"
    ),

    Discos(
        id = 7,
        name = "Renaissance",
        year = "2022",
        imageRes = R.drawable.renaissance,
        description = "Renaissance, lançado em 29 de julho de 2022, é o sétimo álbum de estúdio de Beyoncé. Inspirado na música dance e house, o projeto celebra a cultura club, liberdade e expressão. Com faixas como \"Break My Soul\", o álbum explora temas de empoderamento e escapismo. ",
        curiosities = "Faixas como \"Break My Soul\", \"Cuff It\" e \"Alien Superstar\" trazem uma sonoridade futurista e retrô ao mesmo tempo."
    ),

    Discos(
        id = 7,
        name = "Cowboy Carter",
        year = "2024",
        imageRes = R.drawable.cowboycarter,
        description = "O oitavo álbum de Beyoncé, \"Cowboy Carter\" (2024), é inovador ao resgatar o ritmo country, que, embora tenha sido originalmente criado por artistas negros, foi gradualmente apropriado pela cultura branca. Neste projeto, Beyoncé se une a diversos artistas, incluindo músicos negros do gênero country, para dar nova vida a esse estilo musical, celebrando suas raízes e sua verdadeira história. ",
        curiosities = "Conceitualmente, o álbum é apresentado como transmissão de uma estação de rádio fictícia do Texas"
    ),
)