package Jeronimo;
import java.io.FileWriter;
import java.io.IOException;
public class Jeronimowebs {

	public static void main(String[] args) {
		        String html = """
		        <!DOCTYPE html>
		        <html>
		        <head>
		            <meta charset="UTF-8">
		            <title>Jeronimo Sewing Portfolio</title>
		            <style>
		                body {
		                    font-family: Arial, sans-serif;
		                    background: #f7f7f7;
		                    margin: 0;
		                    padding: 40px;
		                    color: #333;
		                }
		                h1 {
		                    text-align: center;
		                    margin-bottom: 10px;
		                }
		                p.subtitle {
		                    text-align: center;
		                    font-size: 18px;
		                    margin-bottom: 40px;
		                }
		                .project {
		                    background: white;
		                    padding: 20px;
		                    margin-bottom: 20px;
		                    border-radius: 8px;
		                    box-shadow: 0 0 10px rgba(0,0,0,0.1);
		                }
		                h2 {
		                    margin-top: 0;
		                }
		            </style>
		        </head>
		        <body>
		            <h1>Jeronimo Sewing Portfolio</h1>
		            <p class="subtitle">Repairs • Alterations • Custom Work</p>

		            <div class="project">
		                <h2>Hemming Pants</h2>
		                <p>Shortened and re‑hemmed pants for a friend. Clean finish and reinforced stitching.</p>
		            </div>

		            <div class="project">
		                <h2>Jacket Seam Repair</h2>
		                <p>Fixed a ripped seam on a winter jacket and reinforced the inside lining.</p>
		            </div>

		            <div class="project">
		                <h2>Button Replacement</h2>
		                <p>Replaced missing buttons and strengthened loose ones on a shirt.</p>
		            </div>
		        </body>
		        </html>
		        """;

		        try (FileWriter writer = new FileWriter("index.html")) {
		            writer.write(html);
		            System.out.println("Website generated successfully! Check your project folder.");
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
	}

	


