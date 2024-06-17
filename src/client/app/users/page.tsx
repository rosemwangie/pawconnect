'use client';

import { useEffect, useState } from 'react';
import axios from 'axios'; // Import axios

interface User {
    id: number;
    username: string;
    email: string;
}

const Users: React.FC = () => {
    const [users, setUsers] = useState<User[]>([]);
    const [error, setError] = useState<string | null>(null);

    useEffect(() => {
        axios.get('http://localhost:8082/api/v1/users') // Use axios to fetch data
            .then(response => {
                setUsers(response.data);
            })
            .catch(error => {
                setError(error.message);
            });
    }, []);

    if (error) {
        return <div>Error: {error}</div>;
    }

    return (
        <div className="container mx-auto px-4">
            <h1 className="text-2xl font-bold my-4">Users</h1>
            <ul>
                {users.map(user => (
                    <li key={user.id} className="border p-4 mb-2">
                        <p><strong>Username:</strong> {user.username}</p>
                        <p><strong>Email:</strong> {user.email}</p>
                    </li>
                ))}
            </ul>
        </div>
    );
}

export default Users;
