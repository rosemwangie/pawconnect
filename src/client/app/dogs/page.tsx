'use client';

import { useEffect, useState } from 'react';

interface Dog {
    id: number;
    name: string;
    breed: string;
    age: number;
}

const Dogs: React.FC = () => {
    const [dogs, setDogs] = useState<Dog[]>( [] );

    useEffect( () => {
        fetch( 'http://localhost:8080/api/v1/dogs' )
            .then( response => response.json() )
            .then( data => setDogs( data ) );
    }, [] );

    return (
        <div className="container px-4 mx-auto">
            <h1 className="my-4 text-2xl font-bold">Dogs</h1>
            <ul>
                {dogs.map( dog => (
                    <li key={dog.id} className="p-4 mb-2 border">
                        <p><strong>Name:</strong> {dog.name}</p>
                        <p><strong>Breed:</strong> {dog.breed}</p>
                        <p><strong>Age:</strong> {dog.age}</p>
                    </li>
                ) )}
            </ul>
        </div>
    );
}

export default Dogs;
