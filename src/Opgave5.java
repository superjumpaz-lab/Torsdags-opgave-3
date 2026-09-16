/* Hvis du kører programmet får du en række fejl.
* Fix programmet så det kan køre
* outputtet bliver:
* "7 is the smallest!"
*
*  OBS! Skriv hvad du har gjort som kommentar ud for hver linje du fixer
*/
public class Opgave5 { // har lavet en class da der ikke var nogen


    void main() {

        minimum(7, 42);

        // slettet if og fjernet int a og b og lagt værdierne i metode parameter

    }

    void minimum(int a, int b) { // ændret til int fra void, da vi returnere int
        if (a < b) {

            System.out.println(a + " is the smallest number!");

        } else if (b < a) { // tiløjede if of fjernet = og ændret opstilling fra > b til b < a

            System.out.println(b + " is the smallest number!");

        }


    }

}