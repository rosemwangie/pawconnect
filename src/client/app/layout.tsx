import type { Metadata } from "next";
import { Inter } from "next/font/google";
import "./globals.css";

const inter = Inter({ subsets: ["latin"] });

export const metadata: Metadata = {
  title: "Paw Connect",
  description: "A platform to connect dog lovers",
};

export default function RootLayout({
                                     children,
                                   }: {
  children: React.ReactNode;
}) {
  return (
      <html lang="en">
      <head>
        {/* Add any additional head elements here */}
      </head>
      <body className={inter.className}>
      {children}
      </body>
      </html>
  );
}
