import React from 'react';

interface User {
    id: number;
    username: string;
    email: string;
}

interface UserListProps {
    users: User[];
}

const UserList: React.FC<UserListProps> = ( { users } ) => {
    return (
        <div className="container mx-auto">
            <h1 className="mb-4 text-2xl font-bold">User List</h1>
            <ul className="p-4 bg-white rounded-lg shadow-md">
                {users.map( user => (
                    <li key={user.id} className="p-2 border-b last:border-b-0">
                        <p className="font-semibold">{user.username}</p>
                        <p className="text-gray-600">{user.email}</p>
                    </li>
                ) )}
            </ul>
        </div>
    );
};

export default UserList;
