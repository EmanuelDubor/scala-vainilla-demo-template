# Scala Vainilla Demo Template

## How to setup?

1. `$ git clone https://github.com/EmanuelDubor/scala-vainilla.git`
2. `$ git clone https://github.com/EmanuelDubor/scala-vainilla-demo-template.git`
3. `$ mv scala-vainilla-demo-template your-project-name`
4. `$ cd your-project-name`
5. `$ git remote rm origin`
6. `$ git remote add origin your-repo-url`
7. Open `settings.gradle` and rename your game projects core and target platform(s).
    * `demo-core -> your-game-core`
    * `demo-desktop -> your-game-desktop`
8. Open `build.gradle` and change `appName`

## For Desktop

1. Open `desktop/build.gradle` and update dependency on `demo-core` to `your-game-core`
2. Rename main package and/or launcher class and update `project.ext.mainClassName` in `desktop/build.gradle`
3. Profit!

#### How to run?

1. `$ cd desktop`
2. `$ gradle run`

#### How to make a .jar?

1. `$ cd desktop`
2. `$ gradle dist`
3. Look for `your-game-desktop.jar` in `desktop/build/libs`

## Some sample projects

* [Arkanoid](https://github.com/EmanuelDubor/scala-vainilla-demo-arkanoid)