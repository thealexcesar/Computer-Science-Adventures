```ruby
require './character'
require './android'

class Universe
  attr_accessor :name, :leader, :characters

  def initialize(name, leader, characters)
    @name = name
    @leader = leader
    @characters = characters
  end
end

class Character
  attr_reader :name, :type, :moves, :personality, :transformations, :universe, :biography

  def initialize(name, type, moves, personality, transformations, universe, biography)
    @name = name
    @type = type
    @moves = moves
    @personality = personality
    @transformations = transformations
    @universe = universe
    @biography = biography
  end

  def fight(opponent)
    # Gerando um número aleatório para determinar o vencedor
    winner = rand() > 0.5 ? self : opponent

    # Gerando um número aleatório para determinar como o oponente foi derrotado
    result = rand()
    if result < 0.3
      loser = self == winner ? opponent : self
      return "#{winner.name} vence por nocaute! #{loser.name} foi nocauteado e não pode continuar a luta."
    elsif result < 0.6
      loser = self == winner ? opponent : self
      return "#{winner.name} vence! #{loser.name} caiu para fora do ringue e perdeu a partida."
    else
      loser = self == winner ? opponent : self
      return "#{winner.name} vence! #{loser.name} desistiu da luta."
    end
  end
end

class Saiyan < Character
  def initialize(name, moves, personality, transformations, universe, biography)
    super(name, "Saiyan", moves, personality, transformations, universe, biography)
  end
end

class PrideTrooper < Character
  def initialize(name, moves, personality, transformations, universe, biography)
    super(name, "Pride Trooper", moves, personality, transformations, universe, biography)
  end
end

class Android < Character
  def initialize(name, moves, personality, universe, biography)
    super(name, "Android", moves, personality, [], universe, biography)
  end
end

class Tournament
  def fight(character1, character2)
    return character1.fight(character2)
  end
end

# Criando alguns personagens
goku = Saiyan.new("Goku", ["Kamehameha", "Genki Dama"], "Altruísta", ["Super Saiyan", "Super Saiyan Blue"], "Universo 7", "Goku é o herói da série Dragon Ball.")
vegeta = Saiyan.new("Vegeta", ["Big Bang Attack", "Final Flash"], "Arrogante", ["Super Saiyan", "Super Saiyan Blue"], "Universo 7", "Vegeta é o príncipe da raça Saiyajin.")
jiren = PrideTrooper.new("Jiren", ["Power Impact", "Flash Fist Crush"], "Calmo", [], "Universo 11", "Jiren é o membro mais forte da Tropa do Orgulho.")
toppo = PrideTrooper.new("Toppo", ["Justice Flash", "Justice Tornado"], "Autoritário", ["Deus da Destruição Toppo"], "Universo 11", "Toppo é o líder da Tropa do Orgulho.")
android_17 = Android.new("Android 17", ["Energy Field", "Barrier"], "Indiferente", "Universo 7", "Android 17 é um androide criado pelo Dr. Gero.")
```
