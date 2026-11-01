# Strategy — Design Pattern en Java

Exemple du pattern **Strategy** : au lieu de figer le comportement d'attaque dans l'héritage, chaque personnage délègue son attaque à une ou plusieurs stratégies interchangeables.

## Structure (`STRATEGY/`)
- `Personnage` : classe abstraite (`pseudo`, `pv`, `niveau`, `seDeplacer()`, `attaquer()`, `manger()`), contient une liste de stratégies `Attaque`.
- `Attaque` : interface Strategy avec `faire()`.
- `AttaqueGuerrier`, `AttaqueMage` : stratégies concrètes.
- `Guerrier`, `Mage`, `Tank` : classes filles.
- `MageGuerrier` : combine les deux stratégies, sans héritage multiple.
- `Main` : démonstration, y compris le changement de stratégie à l'exécution.

## Lancer
```bash
javac -encoding UTF-8 -d out STRATEGY/*.java
java -cp out STRATEGY.Main
```
