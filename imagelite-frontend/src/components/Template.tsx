import React from "react";
import { SpinnerCarregando } from "./SpinnerCarregando";

interface TemplateProps {
    children: React.ReactNode;
    loading?: boolean;
}

export const Template: React.FC<TemplateProps> = ({ children, loading }: TemplateProps) => {
    return (
        <>
            <Header />
            <div className="container mx-auto mt-8 px-4" >
                { loading ?
                    <div className="flex justify-center items-center h-64">
                        <SpinnerCarregando />
                    </div>
                    : children
                }
            </div>
            <Footer />
        </>
    )
}

const Header: React.FC = () => {
    return (
        <header className="bg-indigo-950 text-white py-3">
            <div className="container mx-auto flex justify-between items-center px-4">
                <h1 className="text-3xl font-bold">ImageLite</h1>
            </div>
        </header>
    );
};

const Footer: React.FC = () => {
    return (
        <footer className="bg-indigo-950 text-white py-4 mt-8" >
            <div className="container mx-auto text-center" >
                Desenvolvido por Thiago Fasina
            </div>
        </footer>
    )
} 