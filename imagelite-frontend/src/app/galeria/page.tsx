"use client"

import { Template, ImageCard } from '@/components'
import { Image } from '@/resources/image/image.resource';
import { useImageService } from '@/resources/image/image.service'
import { useState } from 'react';

export default function GaleriaPage() {

    const useService = useImageService();
    const [images, setImages] = useState<Image[]>([])

    async function searchImages() {
        const result = await useService.buscar();
        setImages(result);
    }

    function renderImageCard(image: Image) {
        return (
            <ImageCard nome={image.name} tamanho={image.size} dataUpload={image.uploadDate} src={image.url} />
        )
    }

    function renderImageCards() {
        return images.map(renderImageCard)
    }

    return (
        <Template>
            <button className='bg-gray-500' onClick={searchImages}>Clique para carregar imagens</button>
            <section className='grid grid-cols-3 gap-8' >
                {renderImageCards()}
            </section>
        </Template>
    )
}