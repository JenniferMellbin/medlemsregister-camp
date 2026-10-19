# medlemsregister-camp
## Ett problem vi löste
Vi fick en merge-konflikt i filen src/Main.java när vi skulle slå ihop två grenar.
Konflikten uppstod eftersom båda grenarna hade ändrat samma rad med välkomsttexten.
Vi löste problemet genom att läsa konfliktmarkeringarna och välja vilken text vi ville behålla.
Sedan kontrollerade vi att programmet fungerade med javac och sparade lösningen med git add, git commit och git push.

FEEDBACK 1: AI placerade listan i Main.java. Listan ska istället ligga i Register.java och vara private.

FEEDBACK 2: AI använde ArrayList som deklarerad typ. Jag ändrade till List<Medlem> och behöll new ArrayList<>().

FEEDBACK 3: AI föreslog sökfunktion, Scanner-meny och createMedlem. Dessa funktioner ska inte vara med i den här uppgiften.

Min reflektion

Listan ska ligga i Register.java eftersom det är den klassen som ansvarar för att hålla reda på medlemmarna. Main ska bara anropa metoderna i Register.

Jag valde bort sökfunktionen, menyn med Scanner och createMedlem eftersom de inte ingår i uppgiften.

Min lista ligger i Register.java och är deklarerad som List<Medlem>. Den skapas med en ArrayList.